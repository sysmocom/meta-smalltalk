DESCRITOPN = "A simple test phone to do a LU and place a call"
HOMEPAGE = "http://osmocom.org"

require smalltalk-package.inc

RDEPENDS += "osmo-st-network osmo-st-logging osmo-st-gsm"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-testphone;protocol=git;branch=master"
SRCREV = "99841c28a6d3a50cf40fa019e8a9fd0c51f3da94"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

