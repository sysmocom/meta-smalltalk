DESCRIPTION = "Iliad webframework"
HOMEPAGE = "http://www.iliadproject.org/"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/zecke/iliad-stable.git;protocol=git;branch=master"
SRCREV = "3469a322b9cae17d452fae1b38d661e14e4ae902"
PV = "0.9.1+gitr${SRCPV}"
PR = "r1"

inherit smalltalk_package

do_compile() {
	gst < /dev/null
	find ${S} -name package.xml -execdir gst-package --target-directory="${S}" {} \;
}
