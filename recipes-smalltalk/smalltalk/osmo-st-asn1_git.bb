DESCRITOPN = "ASN1 Code to work on TCAP/MAP/Camel..."
HOMEPAGE = "http://osmocom.org"

require smalltalk-package.inc

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-asn1;protocol=git;branch=master"
SRCREV = "b77da9be3fd1bc1e2327a3941b47dee69660da56"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

