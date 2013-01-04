DESCRITOPN = ""
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-sip;protocol=git;branch=master"
SRCREV = "e134b1e825206b6cc08ab5a24c3f82e40e0f65ac"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

