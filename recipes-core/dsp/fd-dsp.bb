DESCRIPTION = "Fiberdyne DSP Applications"
LICENSE = "Copyright Fiberdyne Systems Ptv Ltd"
LIC_FILES_CHKSUM = "file://README;md5=13a41cb73f4e89cc25f6d30a672cd576"

PR = "r0"
PV = "0.1"

SRC_URI = "file://files/fd-dsp \
           file://files/fd-dsp-ui \
           file://README \
          "
#This package doesn't have any files for the rootfs in it, option needed to create an empty 
# package so when the rootfs image is made it finds the mksd_xxx.deb package and doesn't complain
FILES_${PN} = ""
ALLOW_EMPTY_${PN} = "1"

do_deploy() {
    install -d ${DEPLOY_DIR_IMAGE}
    install -m 0755 ${SWORKDIR}/files/fd-dsp ${DEPLOY_DIR_IMAGE}
    install -m 0755 ${SWORKDIR}/files/fd-dsp-ui ${DEPLOY_DIR_IMAGE}
}
addtask deploy after do_install
