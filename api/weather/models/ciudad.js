const mongoose = require('mongoose');
const Schema = mongoose.Schema;

//lo de la ciudad
const schema = Schema({
    _name:String,
    _weather:String,
    _message:String
});

class Ciudad{
    constructor(name, weather, message){
        _name = name;
        _weather = weather;
        _message = message;
    }

    get name(){
        return this._name;
    }

    get weather(){
        return this._weather;
    }

    get message(){
        return this._message;
    }      
    
    set name(v){
        this._name = v;
    }

    set message(v){
        this._message = v;
    }

    set weather(v){
        this._weather = v;
    }
}

schema.loadClass(Ciudad);
module.exports = mongoose.model('Ciudad',schema);