
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

## IMPORTANT - The following patches DO NOT work with the AGL meta-netboot.
##             Possibly due to reserved memory overlapping

SRC_URI_append_porter = " \
	file://0001-arm-porter_ADSP-support.patch \
	file://debug-rcar.cfg \	
 	"
## This patch (meta-agl/meta-agl-bsp/meta-renesas))disables sound
## REMOVE IT!
SRC_URI_remove = " file://disable_soc_sound.patch"
