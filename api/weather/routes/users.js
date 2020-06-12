var express = require('express');
var router = express.Router();
const ciudad = require("../models/ciudad");

/* GET users listing. */
router.get('/', function(req, res, next) {
  res.send('respond with a resource');
});

router.post('/', function(req, res, next) {
  let ciudad = new ciudad({
    name:req.body.name,
    weather:req.body.weather,
    message:req.body.message
  });
  ciudad.save().then((obj)=>{
    res.json(obj);
  })
});

module.exports = router;
