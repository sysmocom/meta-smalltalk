DEPENDS = "smalltalk"

INC_PR="r4"

do_compile() {
	gst < /dev/null
	gst-package --target-directory=. package.xml
}

do_install () {
	install -d ${D}${datadir}/smalltalk

	install -m 0644 ${S}/*.star ${D}${datadir}/smalltalk
} 

FILES_${PN} += "${datadir}/smalltalk"

