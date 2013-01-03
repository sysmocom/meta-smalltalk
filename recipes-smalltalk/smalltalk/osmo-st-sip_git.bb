DESCRITOPN = ""
HOMEPAGE = "http://osmocom.org"

require smalltalk-package.inc

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-sip;protocol=git;branch=master"
SRCREV = "e134b1e825206b6cc08ab5a24c3f82e40e0f65ac"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

