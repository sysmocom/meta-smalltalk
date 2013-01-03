DESCRITOPN = ""
HOMEPAGE = "https://gitorious.org/gnu-smalltalk-ports/petitparser"

require smalltalk-package.inc

S = "${WORKDIR}/git"
SRC_URI = "git://gitorious.org/gnu-smalltalk-ports/petitparser.git;protocol=git;branch=master"
SRCREV = "9b76e8cf054cb6bdbc7bc5635c3126a2fefd1a85"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

