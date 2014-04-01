DESCRIPTION = ""
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

RDEPENDS_${PN} += "osmo-st-core osmo-st-logging petitparser"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-sip;protocol=git;branch=master"
SRCREV = "2020d4cdf4363f176374efea370e0719839eb91d"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.1"
