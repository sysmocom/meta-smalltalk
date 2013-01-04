DESCRITOPN = "ASN1 Code to work on TCAP/MAP/Camel..."
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-asn1;protocol=git;branch=master"
SRCREV = "b77da9be3fd1bc1e2327a3941b47dee69660da56"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

