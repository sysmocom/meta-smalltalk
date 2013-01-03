DESCRITOPN = ""
HOMEPAGE = "https://gitorious.org/gnu-smalltalk-ports/petitparser"

require smalltalk-package.inc

RDEPENDS += "petitparser"

S = "${WORKDIR}/git"
SRC_URI = "git://gitorious.org/gnu-smalltalk-ports/petitparser-tests.git;protocol=git;branch=master"
SRCREV = "4b112d1f1af9692807bd28ae192b1fdc69f8c564"
PV = "0.0.1+gitr${SRCREV}"
PR = "${INC_PR}.0"

