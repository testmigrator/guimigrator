import SwiftUI
struct toolbar_with_spinner: View {
    
    var body: some View {
        ZStack
        {
            ProgressView()
                .frame(minWidth:0,maxWidth:.infinity,minHeight:5,idealHeight:5)
            ZStack()
            {
                List
                {
                    ForEach(1..<10)
                    {
                        index in
                        Text("Item \(index)")
                    }
                }
                .listStyle(PlainListStyle())
            }
//            .fill(Color.white)
            .frame(minWidth:0,maxWidth:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity)}}

struct toolbar_with_spinner_Previews: PreviewProvider {
    static var previews: some View {
        toolbar_with_spinner()
    }
}
