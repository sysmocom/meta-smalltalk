DESCRIPTION = "A simple test phone to do a LU and place a call"
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

RDEPENDS_${PN} += "osmo-st-network osmo-st-logging osmo-st-gsm osmo-st-core"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-testphone;protocol=git;branch=master"
SRCREV = "98a9d07856671daf934aa0029f3bebcc13a06f9d"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.1"
