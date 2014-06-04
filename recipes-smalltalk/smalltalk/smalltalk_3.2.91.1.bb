require ${PN}.inc
PR = "r12.${INC_PR}"

# TODO: Upgrade, package the docs, split the packages, create gst class

EXTRA_OECONF_append_arm = " --disable-profiling --disable-prefetch"

SRC_URI = " \
  http://www.secretlabs.de/gnu-smalltalk/smalltalk-${PV}.tar.gz  \
  file://no-doc.patch \
"

SRC_URI[md5sum] = "d1a9b032f61bd72c4af049534b2575e4"
SRC_URI[sha256sum] = "ed56ddac79c3a10ec3cb45cf0a6377e09c1b2fb632ca49e32680d7180bc0ea3c"



LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"


# glib is only in 3.2.90+
PACKAGES =+ "${PN}-glib ${PN}-osprocess ${PN}-netlink"


INSANE_SKIP_${PN}-glib = "dev-so useless-rpaths"
FILES_${PN}-glib = "${libdir}/smalltalk/gst-glib*.so \
	${datadir}/smalltalk/GLib.star ${libdir}/libgst-gobject.so.*"

INSANE_SKIP_${PN}-osprocess = "dev-so"
FILES_${PN}-osprocess = "${libdir}/smalltalk/gst-osprocess*.so \
	${datadir}/smalltalk/OSProcess.star"

INSANE_SKIP_${PN}-netlink = "dev-so"
FILES_${PN}-netlink = "${libdir}/smalltalk/netlink*.so \
	${datadir}/smalltalk/Netlink*.star"
