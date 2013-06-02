DESCRIPTION = ""
HOMEPAGE = "https://gitorious.org/gnu-smalltalk-ports/petitparser"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


require smalltalk-package.inc

RDEPENDS_${PN} += "petitparser"

S = "${WORKDIR}/git"
SRC_URI = "git://gitorious.org/gnu-smalltalk-ports/petitparser-tests.git;protocol=git;branch=master"
SRCREV = "4b112d1f1af9692807bd28ae192b1fdc69f8c564"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.1"

