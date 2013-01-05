DESCRIPTION = "Iliad webframework"
HOMEPAGE = "http://dmitrymatveev.co.uk/shampoo/contribution.html"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a50099a9054443aacf3bb25a2d3b0e"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/dmatveev/shampoo.git;protocol=git;branch=master"
SRCREV = "8815d3c61dfc04d539c8bcc676d35fb1d568698c"
PV = "0.0.1+gitr${SRCPV}"
PR = "r1"

RDEPENDS = "smalltalk-digest"

inherit smalltalk_package
