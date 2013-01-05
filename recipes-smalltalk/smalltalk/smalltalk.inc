DESCRIPTION = "GNU Smalltalk."
HOMEPAGE = "http://smalltalk.gnu.org/"
LICENSE = "GPLv2+"

INC_PR = "2"

DEPENDS = "smalltalk-native gnutls readline"
DEPENDS_virtclass-native = "gnutls-native"

EXTRA_OECONF = "--disable-static --disable-gtk --without-x --without-opengl"
PACKAGES =+ "${PN}-digest ${PN}-expat ${PN}-gdbm ${PN}-sdl ${PN}-sqlite \
	${PN}-seaside ${PN}-magritte ${PN}-magritte-seaside ${PN}-examples "

FILES_${PN}-digest = "${libdir}/smalltalk/digest*.so \
	${datadir}/smalltalk/Digest.star"
FILES_${PN}-expat = "${libdir}/smalltalk/expat*.so \
	${datadir}/smalltalk/XML-Expat.star"
FILES_${PN}-gdbm = "${libdir}/smalltalk/gdbm*.so"
FILES_${PN}-sdl = "${libdir}/smalltalk/sdl*.so"
FILES_${PN}-sqlite = "${libdir}/smalltalk/dbd-sqlite*.so \
	${datadir}/smalltalk/DBD-SQLite.star"
FILES_${PN}-dbg += "${libdir}/smalltalk/.debug ${libexecdir}/smalltalk/.debug"
FILES_${PN}-dev += "${libdir}/smalltalk/*.la"
FILES_${PN}-static += "${libdir}/smalltalk/lib*.a"

FILES_${PN}-seaside = "${datadir}/smalltalk/Seaside*.star"
FILES_${PN}-magritte = "${datadir}/smalltalk/Magritte.star"
FILES_${PN}-magritte-seaside = "${datadir}/smalltalk/Magritte-Seaside.star"

FILES_${PN}-examples = "${datadir}/smalltalk/examples/* ${datadir}/smalltalk/unsupported/*"


inherit autotools

do_configure() {
	sed -i -e 's/^GST = .*$/GST = gst --no-user-files $(GST_OPTS)/' ${S}/Makefile.am
	sed -i -e 's/^GST_PACKAGE = .*$/GST_PACKAGE = XZIP="$(XZIP)" gst-package $(GST_OPTS)/' ${S}/Makefile.am
	sed -i -e 's/"$(abs_top_builddir)\/gst$(EXEEXT)"/gst/' ${S}/Makefile.am
	autotools_do_configure
	rm -f ${S}/libc.la
}

do_configure_virtclass-native() {
	autotools_do_configure
	sed -i -e 's/^module_DATA.*$//' ${S}/Makefile
	rm -f ${S}/libc.la
}

do_install_append() {
	find ${D}${libdir}/smalltalk -name "*.la" -delete
}

BBCLASSEXTEND = "native"

