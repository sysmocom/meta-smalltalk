DESCRITOPN = "This is a MGCP CallAgent written in Smalltalk"
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

RDEPENDS += "osmo-st-logging osmo-st-core"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-mgcp;protocol=git;branch=master"
SRCREV = "e84e9ce915d91030cf97fd9d23c42d4d92729f67"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

