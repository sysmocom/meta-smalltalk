DESCRIPTION = "A Smalltalk logging framework inspired by libosmocore's logging facilities"
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = " \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-logging;protocol=git;branch=master"
SRCREV = "f900c8fc6ef9b7ff54f0d57d092ac6b9d175460b"
PV = "0.0.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
