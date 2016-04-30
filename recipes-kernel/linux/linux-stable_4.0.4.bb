
require recipes-kernel/linux/linux-yocto.inc

# Include again if special branch is needed
#KBRANCH_qemuarmv7 ?= "v4.0.4"
KBRANCH_qemuarmv7 ?= "master"
SRCREV_qemuarmv7 ?="${AUTOREV}"
#SRCREV_qemuarmv7 ?="8663da2c0919896788321cd8a0016af08588c656"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;protocol=git;bareclone=1;branch=${KBRANCH} "

#SRCREV="${AUTOREV}"

#SRC_URI += "file://${KMACHINE}_defconfig "

SRC_URI += "file://${KMACHINE}_defconfig \
            file://qemuarmv7.scc  \
            file://qemuarmv7.cfg \
            file://qemuarmv7-user-config.cfg \
            file://qemuarmv7-user-patches.scc \
            "

#SRC_URI_qemuarmv7 += " file://qemuarmv7.scc  \
#             file://qemuarmv7.cfg \
#             file://qemuarmv7-user-config.cfg \
#             file://qemuarmv7-user-patches.scc \
#	        "

LINUX_VERSION ?= "4.0.4"
LINUX_VERSION_EXTENSION ?= "-qemuarm-bsp"

PR = "r0"
PV = "${LINUX_VERSION}+git${SRCPV}"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "qemuarmv7"

