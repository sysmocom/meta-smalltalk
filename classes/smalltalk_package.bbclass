DEPENDS = "smalltalk-native"
RDEPENDS_${PN} += "smalltalk"

smalltalk_package_do_compile() {
	gst < /dev/null
	gst-package --target-directory=. package.xml
}

smalltalk_package_do_install () {
	install -d ${D}${datadir}/smalltalk

	install -m 0644 ${S}/*.star ${D}${datadir}/smalltalk
}

FILES_${PN} += "${datadir}/smalltalk"

EXPORT_FUNCTIONS do_compile do_install
