function createNode(element) {
    return document.createElement(element);
}
function append(parent, el) {
    return parent.appendChild(el);
}
//here is my api
const apiUrl = 'https://www.googleapis.com/books/v1/volumes?q=quilting';

//Here is the list we will change
const ol = document.getElementById('MyLovelyBooks');

//fetch the api
fetch(apiUrl)
    //get a response
    .then((resp) => resp.json())
    //make a function that gets the data from the api
    .then(function (data) {
        //I want to see all the feilds I'll be working with
        console.log(data);
        //Make a variable that gets all the items(we could also add 
        //.volumeInfo to make it easier to access rather then speratly calling volumeInfo but whatever)
        let author = data.items;
        //Return the data from the api
        return author.map(function (authors) {
            //Make new nodes in html that will be filled with the fields from data
            let li = createNode('li'),
                a = createNode('a'),
                img = createNode('img'),
                br = createNode('br'),
                div = createNode('div'),
                art = createNode('article'),
                header = createNode('header');
            //Set Attributes to make it so that you can set attributes like href and src to the element as well as the value
            a.setAttribute('href', authors.volumeInfo.canonicalVolumeLink);
            img.setAttribute('src', authors.volumeInfo.imageLinks.smallThumbnail);
            //Fill the elements we generated with the values from the table
            header.innerHTML = authors.volumeInfo.title;
            div.innerHTML = authors.volumeInfo.authors;
            art.innerHTML = authors.volumeInfo.description;
            //Append some children to an existing element
            append(a, img);
            append(li, a);
            append(a, header);                  
            append(a, br);
            append(a, div);
            append(a, br);
            append(a, art);
            append(ol, li);
        })
    })
    .catch(function (error) {
        console.log(error);
    });
