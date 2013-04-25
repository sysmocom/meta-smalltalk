DESCRIPTION = "Handling page faults in user mode"
HOMEPAGE = "http://www.gnu.org/software/libsigsegv/"

LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=a4e436f29b73fbaa5360691ba7fcbd8c"

SRC_URI = "${GNU_MIRROR}/libsigsegv/libsigsegv-2.10.tar.gz"
SRC_URI[md5sum] = "7f96fb1f65b3b8cbc1582fb7be774f0f"
SRC_URI[sha256sum] = "8460a4a3dd4954c3d96d7a4f5dd5bc4d9b76f5754196aa245287553b26d2199a"

PR = "r1"

inherit autotools
