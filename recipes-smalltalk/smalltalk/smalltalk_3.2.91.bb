require ${PN}.inc
PR = "r12.${INC_PR}"

# TODO: Upgrade, package the docs, split the packages, create gst class

EXTRA_OECONF_append_arm = " --disable-profiling --disable-prefetch"

SRC_URI = " \
  http://www.secretlabs.de/gnu-smalltalk/smalltalk-${PV}.tar.gz  \
  file://no-doc.patch \
"

SRC_URI[md5sum] = "aa092b507d93173177eecca63e3ddd6a"
SRC_URI[sha256sum] = "662ca7364c9248a95ec0ebbd56336062d1d72a1feb8c17560f4f7d3b7aea331f"


LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"


# glib is only in 3.2.90+
PACKAGES =+ "${PN}-glib ${PN}-osprocess ${PN}-gtktools"


INSANE_SKIP_${PN}-glib = "dev-so useless-rpaths"
FILES_${PN}-glib = "${libdir}/smalltalk/gst-glib*.so \
	${datadir}/smalltalk/GLib.star ${libdir}/libgst-gobject.so.*"

INSANE_SKIP_${PN}-osprocess = "dev-so"
FILES_${PN}-osprocess = "${libdir}/smalltalk/gst-osprocess*.so \
	${datadir}/smalltalk/OSProcess.star"

INSANE_SKIP_${PN}-gtktools = "dev-so"
FILES_${PN}-gtktools = "${datadir}/smalltalk/GTKTools*.star"
