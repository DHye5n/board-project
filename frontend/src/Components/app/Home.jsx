import React from "react";
import { Link } from "react-router-dom";

function Home() {
    return (
        <div className="container mt-5">
            <div className="jumbotron">
                <h1 className="display-4">Welcome to Jhcode33's Board!</h1>
                <p className="lead">
                    Explore and engage with the community. Share your thoughts, ask questions,
                    and connect with others through this SPA board.
                </p>
                <hr className="my-4" />
                <p>
                    Ready to get started? Check out the latest posts or create your own.
                </p>
                <Link to="/bbslist">
                    <button className="btn btn-primary btn-lg">Go to Board List</button>
                </Link>
                <br></br><br></br>
                <div className="mt-4">
                    <h3>🖥️Source code on GitHub:</h3>
                    <ul>
                        <li>
                            <a href="https://github.com/DHye5n/board-project" target="_blank" rel="noopener noreferrer">Project Repository</a>
                        </li>
                    </ul>
                </div>
                <br></br>
                <div className="mt-4">
                    <h5>📧Contact me email</h5>
                    - &nbsp;
                    <a href="mailto:sai4875@naver.com">sai4875@naver.com</a>

                </div>
            </div>
        </div>
    );
}

export default Home;