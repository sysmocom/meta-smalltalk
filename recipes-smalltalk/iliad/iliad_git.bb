DESCRIPTION = "Iliad webframework"
HOMEPAGE = "http://www.iliadproject.org/"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/zecke/iliad.git;protocol=git;branch=master"
SRCREV = "9cfd753a5ce7f811d87f28796d32f3fcaa1c878c"
PV = "0.9.1.1+gitr${SRCPV}"

inherit smalltalk_package

PR = "r5"

RDEPENDS_${PN} += "smalltalk-iconv grease"

do_compile() {
	gst < /dev/null
	find ${S} -name package.xml -execdir gst-package --target-directory="${S}" {} \;
}
