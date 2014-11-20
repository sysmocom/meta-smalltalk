DESCRIPTION = "GNU Smalltalk."
HOMEPAGE = "http://smalltalk.gnu.org/"
LICENSE = "GPLv2+"

INC_PR = "12"

DEPENDS = "smalltalk-native gnutls readline libsigsegv libtool libffi zip-native expat sqlite3"
DEPENDS_virtclass-native = "gnutls-native libffi-native libsigsegv-native"

EXTRA_OECONF = "--disable-static --disable-gtk --without-x --without-opengl --with-tcl=/bin/false --with-tk=/bin/false --without-emacs gst_cv_libc_dlopen_works=hacked gst_cv_readline_libs='-lreadline'"
PACKAGES =+ "${PN}-digest ${PN}-expat ${PN}-iconv ${PN}-i18n ${PN}-gdbm ${PN}-sdl \
	${PN}-sqlite ${PN}-seaside ${PN}-magritte ${PN}-magritte-seaside ${PN}-examples \
	${PN}-xml ${PN}-zlib"

# skip dev-so for plugins
INSANE_SKIP_${PN}-digest = "dev-so"
INSANE_SKIP_${PN}-expat = "dev-so"
INSANE_SKIP_${PN}-iconv = "dev-so"
INSANE_SKIP_${PN}-i18n = "dev-so"
INSANE_SKIP_${PN}-gdbm = "dev-so"
INSANE_SKIP_${PN}-sdl = "dev-so"
INSANE_SKIP_${PN}-sqlite = "dev-so"
INSANE_SKIP_${PN}-xml = "dev-so"
INSANE_SKIP_${PN}-zlib = "dev-so"

# gst-tool and such
INSANE_SKIP_${PN} = "useless-rpaths"

FILES_${PN}-digest = "${libdir}/smalltalk/digest*.so \
	${datadir}/smalltalk/Digest.star"
FILES_${PN}-expat = "${libdir}/smalltalk/expat*.so \
	${datadir}/smalltalk/XML-Expat.star"
FILES_${PN}-iconv = "${libdir}/smalltalk/iconv*.so \
	${datadir}/smalltalk/I18N.star ${datadir}/smalltalk/Iconv.star"
FILES_${PN}-i18n = "${libdir}/smalltalk/i18n*.so \
	${datadir}/smalltalk/I18N.star ${datadir}/smalltalk/I18N.star"
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
FILES_${PN}-xml = "${datadir}/smalltalk/XML*.star ${datadir}/smalltalk/XPath.star ${datadir}/smalltalk/XSL.star ${libdir}/smalltalk/expat-*.so"
FILES_${PN}-zlib = "${libdir}/smalltalk/zlib*.so \
	${datadir}/smalltalk/ZLib.star"

FILES_${PN}-examples = "${datadir}/smalltalk/examples/* ${datadir}/smalltalk/unsupported/*"


inherit autotools

do_configure() {
	sed -i -e 's/^GST = .*$/GST = gst --no-user-files $(GST_OPTS)/' ${S}/Makefile.am
	sed -i -e 's/^GST_PACKAGE = .*$/GST_PACKAGE = XZIP="$(XZIP)" gst-package $(GST_OPTS)/' ${S}/Makefile.am
	sed -i -e 's/"$(abs_top_builddir)\/gst$(EXEEXT)"/gst/' ${S}/Makefile.am
	autotools_do_configure
}

do_configure_virtclass-native() {
	autotools_do_configure
	sed -i -e 's/^module_DATA.*$//' ${B}/Makefile
}

do_install_append() {
	find ${D}${libdir}/smalltalk -name "*.la" -delete
}

BBCLASSEXTEND = "native"

