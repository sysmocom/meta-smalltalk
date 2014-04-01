DESCRIPTION = "This is a simple MSC done in Smalltalk"
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

RDEPENDS_${PN} += "osmo-st-logging osmo-st-network osmo-st-gsm osmo-st-core"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-msc;protocol=git;branch=master"
SRCREV = "b880a9907011c4f1e37b7c3cc8e4549a6520f5a1"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
