var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  let c = new Object();
  c.city = "Chihuahua";
  c.weather = "40°";
  c.message = "Infernal";
  res.json({c});
});

module.exports = router;