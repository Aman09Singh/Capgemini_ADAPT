function description(lModel,desk_no,name) {
    
    let text = {
            "model":lModel,
            "no":desk_no,
            "name":name
    }
    console.log(`This is the Model : ${text.model}\n
This is the NO : ${text.no}\n
This is the Name : ${text.name}`);
}
description("Ideapad",23,"Lenovo");