DESCRIPTION = "GNU Smalltalk."
HOMEPAGE = "http://people.freedesktop.org/~whot/evtest/"
LICENSE = "GPLv2"
PR = "r9"

DEPENDS = "smalltalk-native"
DEPENDS_virtclass-native = ""

SRC_URI = " \
  ftp://ftp.gnu.org/gnu/smalltalk/smalltalk-3.2.4.tar.gz \
  file://gst-remote-hostname.patch \
  file://gst-remote-typo.patch \
  file://gst-remote-resume.patch \
  file://fix_clock_behavior_across_image.patch \
  file://fix_fd_resume.patch \
"
SRC_URI[md5sum] = "a36a7c9beddca08dc492b500738efc82"
SRC_URI[sha256sum] = "901cc7090a1fa44bc60900a970d207de4aa3bdfdce72bea55114e243bc1eb1b3"

EXTRA_OECONF = "--disable-static --disable-gtk --without-x"

PACKAGES =+ "${PN}-digest ${PN}-expat ${PN}-gdbm ${PN}-opengl ${PN}-sdl ${PN}-sqlite"

FILES_${PN}-digest = "${libdir}/smalltalk/digest*.so"
FILES_${PN}-expat = "${libdir}/smalltalk/expat*.so"
FILES_${PN}-gdbm = "${libdir}/smalltalk/gdbm*.so"
FILES_${PN}-opengl = "${libdir}/smalltalk/gstopengl*.so"
FILES_${PN}-sdl = "${libdir}/smalltalk/sdl*.so"
FILES_${PN}-sqlite = "${libdir}/smalltalk/dbd-sqlite*.so"
FILES_${PN}-dbg += "${libdir}/smalltalk/.debug ${libexecdir}/smalltalk/.debug"
#FILES_${PN}-dev += "${libdir}/smalltalk/*.so ${libdir}/smalltalk/*.la"
FILES_${PN}-dev += "${libdir}/smalltalk/*.la"
FILES_${PN}-static += "${libdir}/smalltalk/lib*.a"

inherit autotools

do_configure() {
	sed -i -e 's/^GST = .*$/GST = gst --no-user-files $(GST_OPTS)/' ${S}/Makefile.am
	sed -i -e 's/^GST_PACKAGE = .*$/GST_PACKAGE = XZIP="$(XZIP)" gst-package $(GST_OPTS)/' ${S}/Makefile.am
	sed -i -e 's/"$(abs_top_builddir)\/gst$(EXEEXT)"/gst/' ${S}/Makefile.am
	autotools_do_configure
}

do_configure_virtclass-native() {
	autotools_do_configure
	sed -i -e 's/^module_DATA.*$//' ${S}/Makefile
	rm -f ${S}/libc.la
}

BBCLASSEXTEND = "native"

