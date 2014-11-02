DESCRIPTION = ""
HOMEPAGE = "https://gitorious.org/gnu-smalltalk-ports/petitparser"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

S = "${WORKDIR}/git"
SRC_URI = "git://gitorious.org/gnu-smalltalk-ports/petitparser.git;protocol=git;branch=master"
SRCREV = "9b76e8cf054cb6bdbc7bc5635c3126a2fefd1a85"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"

