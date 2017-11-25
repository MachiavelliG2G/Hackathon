const io = require('socket.io-client');

const socket = io('http://192.168.42.1:5566');
socket.on('connect', function() {
    console.log("CONNECTED");
});
socket.on('event', function(data) {
    console.log(data);
});
socket.on('disconnect', function() {
    console.log("DISCONNECTED");
});