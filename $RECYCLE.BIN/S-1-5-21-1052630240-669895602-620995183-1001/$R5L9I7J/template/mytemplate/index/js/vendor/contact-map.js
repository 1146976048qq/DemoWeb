$(document).ready(function () {
    var center = [37.772323, -122.214897];
    $('#map')
            .gmap3({
                center: center,
                zoom: 16,
                mapTypeId: google.maps.MapTypeId.ROADMAP
            })
            .marker({
                position: center,
                icon: 'http://maps.google.com/mapfiles/marker_green.png'
            });
    console.log("ready!");
});