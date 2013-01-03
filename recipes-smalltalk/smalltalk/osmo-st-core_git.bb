DESCRITOPN = ""
HOMEPAGE = "http://osmocom.org"

require smalltalk-package.inc

RDEPENDS += "osmo-st-logging"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-core;protocol=git;branch=master"
SRCREV = "22f6836925cb1c682045497d214773a3d04e60b2"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

