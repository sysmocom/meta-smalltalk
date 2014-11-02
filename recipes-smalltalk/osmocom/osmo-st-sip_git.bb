DESCRIPTION = ""
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = " \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

RDEPENDS_${PN} += "osmo-st-core osmo-st-logging petitparser smalltalk-digest"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-sip;protocol=git;branch=master"
SRCREV = "88c800559736a39edc67fda0506460dcbf4976cf"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.2"
