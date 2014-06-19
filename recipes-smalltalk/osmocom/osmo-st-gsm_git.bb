DESCRIPTION = "GSM utilities based on osmo-network for SCCP,BSSAP,BSSMAP,GSM48"
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

RDEPENDS_${PN} += "osmo-st-core osmo-st-network osmo-st-logging"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-gsm;protocol=git;branch=master"
SRCREV = "00ee3d0ea0cda615ba58705d08380a116193743d"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
