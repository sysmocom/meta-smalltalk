DESCRITOPN = ""
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

RDEPENDS += "osmo-st-logging"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-core;protocol=git;branch=master"
SRCREV = "2b81cc18c6cd29c8d944a3d8c152c4a19ff882c0"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

