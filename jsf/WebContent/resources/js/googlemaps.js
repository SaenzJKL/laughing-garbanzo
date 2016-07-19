var map;
var directionsDisplay;
var directionsService;

function initMap() {
	directionsService = new google.maps.DirectionsService();
	directionsDisplay = new google.maps.DirectionsRenderer();
    map = new google.maps.Map(document.getElementById('map'), {
      center: {lat: 25.741079, lng: -100.304915},
      zoom: 14,
      disableDefaultUI: true
    });
	directionsDisplay.setMap(map);
}

function calcRoute() {
	var request = {
		destination: {lat: 25.723924, lng: -100.313498},
		origin: {lat: 25.741079, lng: -100.304915},
		travelMode: google.maps.TravelMode.DRIVING
	};

	directionsService.route(request, function(result, status) {
		if (status == google.maps.DirectionsStatus.OK) {
			directionsDisplay.setDirections(result);
		}
	});
}

function finishRide() {
	btn = document.getElementById('mapForm:finish_ride_btn');
    btn.click();
}