DEPENDS = "smalltalk-native"
RDEPENDS_${PN} += "smalltalk"
GST_PACKAGE_XML ?= "package.xml"
GST_KERNEL_DIR = "${STAGING_DIR_NATIVE}${prefix_native}/share/smalltalk/kernel"

smalltalk_package_do_compile() {
	gst --kernel-directory=${GST_KERNEL_DIR} < /dev/null
	gst-package --kernel-directory=${GST_KERNEL_DIR} --target-directory=. ${GST_PACKAGE_XML}
}

smalltalk_package_do_install () {
	install -d ${D}${datadir}/smalltalk

	install -m 0644 ${S}/*.star ${D}${datadir}/smalltalk
}

FILES_${PN} += "${datadir}/smalltalk"

EXPORT_FUNCTIONS do_compile do_install
