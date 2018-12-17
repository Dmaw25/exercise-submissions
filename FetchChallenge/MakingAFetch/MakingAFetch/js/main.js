function createNode(element) {
    return document.createElement(element);
}
function append(parent, el) {
    return parent.appendChild(el);
}
const apiUrl = 'https://www.googleapis.com/books/v1/volumes?q=quilting';
//const req = new Request(apiUrl);
const ul = document.getElementById('MyLovelyBooks');

fetch(apiUrl)
    .then((resp) => resp.json())
    .then(function (data) {
        console.log(data);
        let author = data.items;
        return author.map(function (authors) {
            let li = createNode('li'),
                a = createNode('a'),
                br = createNode('br'),
                div = createNode('div'),
                art = createNode('article'),
                header = createNode('header');
            a.setAttribute('href', `${authors.volumeInfo.canonicalVolumeLink}`, 'target', "_blank");
            header.innerHTML = `${authors.volumeInfo.title}`;
            div.innerHTML = `${authors.volumeInfo.authors}`;
            art.innerHTML = `${authors.volumeInfo.description}`;
            append(a, header);
            append(li, a);
            append(li, br);
            append(a, div);
            append(a, art);
            append(ul, li);
        })
    })
    .catch(function (error) {
        console.log(error);
    });

// Your code here!
