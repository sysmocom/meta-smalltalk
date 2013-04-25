DESCRIPTION = "Iliad webframework"
HOMEPAGE = "http://www.iliadproject.org/"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/zecke/iliad.git;protocol=git;branch=master"
SRCREV = "9d660f6dedc4dc6418a7dff8a24f93bd351fa224"
PV = "0.9.1+gitr${SRCPV}"
PR = "r4"

inherit smalltalk_package

RDEPENDS_${PN} += "smalltalk-iconv grease"

do_compile() {
	gst < /dev/null
	find ${S} -name package.xml -execdir gst-package --target-directory="${S}" {} \;
}
