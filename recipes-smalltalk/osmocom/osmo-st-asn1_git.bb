DESCRIPTION = "ASN1 Code to work on TCAP/MAP/Camel..."
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = " \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

RDEPENDS_${PN} += "osmo-st-core osmo-st-logging"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-asn1;protocol=git;branch=master"
SRCREV = "4e3227730b0f8e48fc4513d0d614d90f52531678"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.1"
