DESCRITOPN = "osmo-network a module for networking (SCCP, M3UA, IPA) protocol handling"
HOMEPAGE = "http://osmocom.org"

require smalltalk-package.inc

RDEPENDS += "osmo-st-logging"

S = "${WORKDIR}/git"
SRC_URI = "git://git.osmocom.org/smalltalk/osmo-st-network;protocol=git;branch=master"
SRCREV = "d7b2323602771681119bdb0507de3fc58f519aae"
PV = "0.0.2+gitr${SRCREV}"
PR = "${INC_PR}.0"

