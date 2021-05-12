var pubnub = new PubNub({
    subscribe_key: 'sub-c-4377ab04-f100-11e3-bffd-02ee2ddab7fe'
    });
    pubnub.subscribe({
        channels: ['pubnub-market-orders']
    });
    pubnub.addListener({
    message: function(message) {
    //console.log(message.message);
		postStream(message.message);
	 }
    });
   

function postStream(message){
	var xhttp = new XMLHttpRequest();
	xhttp.open("POST", "stream");
	//xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	xhttp.setRequestHeader("Content-type", "application/json");
	//xhttp.send("fname=Henry&lname=Ford");
	xhttp.send(JSON.stringify(message));
	
}