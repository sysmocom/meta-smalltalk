DESCRIPTION = "This is a MGCP CallAgent written in Smalltalk"
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

RDEPENDS += "osmo-st-logging osmo-st-core"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-mgcp;protocol=git;branch=master"
SRCREV = "ca0d7624a8320a452e7071c99063d319aa34aed1"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"
