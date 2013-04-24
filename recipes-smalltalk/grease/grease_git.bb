DESCRIPTION = "Grease compability layer"
HOMEPAGE = "http://github.com/NicolasPetton/grease"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/NicolasPetton/Grease.git;protocol=git;branch=master"
SRCREV = "131f4216188310992db37836e0ea248a9a152406"
PV = "3.0+gitr${SRCPV}"
PR = "r2"


inherit smalltalk_package

RDEPENDS_${PN} += "smalltalk-digest"
