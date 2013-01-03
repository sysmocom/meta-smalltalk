DESCRITOPN = "A Smalltalk logging framework inspired by libosmocore's logging facilities"
HOMEPAGE = "http://osmocom.org"

require smalltalk-package.inc

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-logging;protocol=git;branch=master"
SRCREV = "39eeb846821a2b1e6b0eb1c932eb4c1326db8a28"
PV = "0.0.2+gitr${SRCREV}"
PR = "${INC_PR}.0"

