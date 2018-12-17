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
        console.log(data);
        let author = data.items;
        return author.map(function (authors) {
            let li = createNode('li'),
                a = createNode('a'),
                img = createNode('img'),
                br = createNode('br'),
                div = createNode('div'),
                art = createNode('article'),
                header = createNode('header');
            a.setAttribute('href', `${authors.volumeInfo.canonicalVolumeLink}`, 'target', "_blank");
            img.setAttribute('src', `${authors.volumeInfo.imageLinks.smallThumbnail}`);
            header.innerHTML = `${authors.volumeInfo.title}`;
            div.innerHTML = `${authors.volumeInfo.authors}`;
            art.innerHTML = `${authors.volumeInfo.description}`;
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
