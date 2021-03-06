DESCRIPTION = "osmo-network a module for networking (SCCP, M3UA, IPA) protocol handling"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = " \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
HOMEPAGE = "http://osmocom.org"

require smalltalk-package.inc

RDEPENDS_${PN} += "osmo-st-logging osmo-st-core"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-network;protocol=git;branch=master"
SRCREV = "9cf469c2614c26673a6a896042ce1449e156bec6"
PV = "0.0.2+gitr${SRCPV}"
PR = "${INC_PR}.1"
