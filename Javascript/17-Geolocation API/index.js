let markers, map;

function initMap() {
    const posicion = {
    lat: -25.363,
    lng: 131.031,
    };

    map = new google.maps.Map(document.getElementById("map"), {
    zoom: 4,
    center: posicion,
    });
    markers.push(
        new google.maps.Marker({
            position: {
                lat: -49.346040517625084,
                lng: 69.62667081365451,
            },
            map,
            title: "IDK",
            })
    );
    markers.push(
        new google.maps.Marker({
            position: {
                lat: 44.51406996618077,
                lng: -64.29501614666347,
            },
            map,
            title: "Oak Island",
            })
    );
    markers.push(
        new google.maps.Marker({
            position: {
                lat: 48.13347821324079,
                lng: 11.577490722499938,
            },
            map,
            title: "Munich",
            })
    );
}