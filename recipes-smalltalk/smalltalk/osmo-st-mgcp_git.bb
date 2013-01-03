DESCRITOPN = "This is a MGCP CallAgent written in Smalltalk"
HOMEPAGE = "http://osmocom.org"

require smalltalk-package.inc

RDEPENDS += "osmo-st-logging osmo-st-core"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-mgcp;protocol=git;branch=master"
SRCREV = "e84e9ce915d91030cf97fd9d23c42d4d92729f67"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

