DESCRIPTION = "Macro-Assembler for various backends"
HOMEPAGE = "http://www.gnu.org/software/lightning/"

DEPENDS = "libtool-native zlib"

LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=6a6a8e020838b23406c81b19c1d46df6"

SRC_URI = "git://git.sv.gnu.org/lightning.git;protocol=git"
SRCREV= "1cb0e18c7b217066d42ba48d956b5ba64d65725a"
S = "${WORKDIR}/git"

PR = "r3"

EXTRA_OECONF = "--disable-disassembler"

inherit autotools

# Make some default assumptions that disable some tests
CACHED_CONFIGUREVARS += " \
	ac_cv_test_x86_x87=no \
	ac_cv_test_arm_arm=no \
	ac_cv_test_arm_swf=no \
	"

BBCLASSEXTEND = "native"
